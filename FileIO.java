package algorithm;

import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
//import javafx.embed.swing.JFXPanel;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileIO {

    /**
     * get text from any file
     *
     * @param dir
     * @return
     * @throws FileNotFoundException
     */
    public static String getTextFile(String dir) throws FileNotFoundException, IOException {
        String text = "";
        BufferedReader read = new BufferedReader(new FileReader(new File(dir)));
        String line;
        if ((line = read.readLine()) != null) {
            text += line;
            while ((line = read.readLine()) != null) {
                text += "\n" + line;
            }
        }
        return text;
    }

    /**
     * create new file or change content file
     *
     * @param dir
     * @param content
     * @throws FileNotFoundException
     */
    public static void newFile(String dir, Object content) throws FileNotFoundException {
        PrintWriter file = new PrintWriter(dir);
        file.print(content);
        file.close();
    }

    /**
     * delete file
     *
     * @param dir
     * @param from
     * @throws IOException
     */
    public static void delFile(String dir, JFrame from) throws IOException {
        Path path = FileSystems.getDefault().getPath(dir);
        Files.delete(path);
        from.dispose();
    }

    /**
     * get file list from folders
     *
     * @param dir
     * @return String[]
     */
    public static String[] getListFiles(String dir) {
        File fl = new File(dir);
        String[] list = fl.list();
        for (int i = 0; i < list.length; i++) {
            list[i] = dir + "/" + list[i];
        }
        return list;
    }

    /**
     * get file name
     *
     * @param dir
     * @param ex
     * @return String
     */
    public static String getFileName(String dir, String ex) {
        String[] file = dir.split("/");
        String[] nameList = file[file.length - 1].split(ex);
        String name = "";
        for (String x : nameList) {
            name += x;
        }
        return name;
    }

    /**
     * check file if available or not
     *
     * @param folder
     * @param file
     * @return boolean
     */
    public static boolean checkFile(String folder, String file) {
        String[] list = getListFiles(folder);
        file = folder + "/" + file;
        for (String name : list) {
            if (name.equals(file)) {
                return true;
            }
        }
        return false;
    }

    /**
     * choose direction from the device
     *
     * @param name
     * @return String direction
     */
    public static String chooseDir(String name) {
        return chooseDir(name, null);
    }

    /**
     * choose direction from the device
     *
     * @param name
     * @param extensions
     * @return String direction
     */
    public static String chooseDir(String name, String[] extensions) {
        JFileChooser choose = new JFileChooser();
        if (extensions != null) {
            for (String extension : extensions) {
                choose.setFileFilter(new FileNameExtensionFilter("." + extension, extension));
            }
        }
        choose.showDialog(choose, name);
        return choose.getSelectedFile() + "";
    }

    /**
     * run file with any extension
     *
     * @param name
     * @throws IOException
     */
    public static void runFile(String name) throws IOException {
        Desktop.getDesktop().open(new File(name));
    }

    /**
     * run HTML files
     *
     * @param name
     * @throws IOException
     */
    public static void runHTML(String name) throws IOException {
        Desktop.getDesktop().browse(new File(name).toURI());
    }

    /**
     * get image from direction
     *
     * @param imagePath
     * @return Image
     * @throws IOException
     */
    public static Image getImage(String imagePath) throws IOException {
        return ImageIO.read(new File(imagePath));
    }

    /**
     * get image class from java package
     *
     * @param imagePath
     * @return Image
     * @throws IOException
     */
    public Image getImageClass(String imagePath) throws IOException, IllegalArgumentException {
        return ImageIO.read(getClass().getResource(imagePath));
    }

    /**
     * get image from class
     *
     * @param imagePath
     * @return ImageIcon
     * @throws IOException
     */
    public static ImageIcon getImageIcon(String imagePath) throws IOException, IllegalArgumentException {
        return new ImageIcon(new FileIO().getImageClass(imagePath));
    }

    /**
     * get image from class
     *
     * @param image
     * @return ImageIcon
     */
    public static ImageIcon getImageIcon(Image image) {
        return new ImageIcon(image);
    }

    /**
     * resize image
     *
     * @param imagePath
     * @param outputImagePath
     * @param imageWidth
     * @param imageHeight
     * @throws IOException
     */
    public static void resizeImage(String imagePath, String outputImagePath, int imageWidth, int imageHeight) throws IOException {
        File inputFile = new File(imagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImage = new BufferedImage(imageWidth, imageHeight, inputImage.getType());
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, imageWidth, imageHeight, null);
        g2d.dispose();
        String formatName = outputImagePath.substring(outputImagePath.lastIndexOf(".") + 1);
        ImageIO.write(outputImage, formatName, new File(outputImagePath));
    }

    /**
     * play or stop audio file in project
     *
     * @param name
     * @param play
     */
//    public static void playAudio(String name, boolean play) {
//        JFXPanel x = new JFXPanel();
//        String uri = new File(name).toURI().toString();
//        if (play) {
//            new MediaPlayer(new Media(uri)).play();
//        } else {
//            new MediaPlayer(new Media(uri)).stop();
//        }
//    }
}
