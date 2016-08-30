package org.fundacionjala.EANCode;

/**
 * Created by SergioLanda on 8/29/2016.
 */
public class EANValidator {
    static StringBuilder stringBuilder;
    static Integer checksum = 0;

    /**
     * Calculate checksum
     * @param number
     * @return checksum
     */
    public static int calculateCheckSum(String number) {
        Integer temporal = 0;
        stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            if ((i + 1) % 2 == 0) temporal += Integer.parseInt(stringBuilder.substring(i, i + 1)) * 3;
             else temporal += Integer.parseInt(stringBuilder.substring(i, i + 1));
        }
        if (temporal % 10 == 0)
            checksum = 0;
         else
            checksum = 10 - (temporal % 10);
        return checksum;
    }

    /**
     * Validate string number
     * @param number
     * @return validation
     */
    public static boolean validate(String number) {
        int checksum = calculateCheckSum(number);
        if (checksum == number.charAt(12) - 48) return true;
         else return false;
    }
}
