package algorithm;

public class Methods {

    /**
     * encrypt string
     *
     * @param txt
     * @param key
     * @param eq
     * @return String encrypted
     * @throws java.lang.Exception
     */
    public static String encryption(String txt, double key, char eq) throws Exception {
        String r = "";
        switch (eq) {
            case '+':
                for (int i = 0; i < txt.length(); i++) {
                    r += (char) (txt.charAt(i) + key);
                }
                break;
            case '-':
                for (int i = 0; i < txt.length(); i++) {
                    r += (char) (txt.charAt(i) - key);
                }
                break;
            case '*':
                for (int i = 0; i < txt.length(); i++) {
                    r += (char) (txt.charAt(i) * key);
                }
                break;
            case '/':
                for (int i = 0; i < txt.length(); i++) {
                    r += (char) (txt.charAt(i) / key);
                }
                break;
            default:
                throw new Exception();
        }
        return r;
    }

    /**
     * Check string if email or not
     *
     * @param email
     * @return boolean
     */
    public static boolean checkEmail(String email) {
        return email.split("@").length < 10 && isDomain(email.split("@")[1]) && email.indexOf("@") > 3;
    }

    /**
     * Check string if Egypt phone number or not
     *
     * @param phone
     * @return boolean
     */
    public static boolean checkPhoneEG(String phone) {
        return (phone.startsWith("010") || phone.startsWith("011") || phone.startsWith("012") || phone.startsWith("015")) && phone.length() == 11;
    }

    /**
     * Check String is domain or not
     *
     * @param domain
     * @return boolean
     */
    public static boolean isDomain(String domain) {
        return domain.indexOf(".") > 2 && domain.indexOf(".") < domain.length() - 2;
    }
}
