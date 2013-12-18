
package org.anshen.test.strings;

public class WhitherStringBuilder {

    public String implicit(String[] fields) {
        String s = "";
        for (int i = 0; i < fields.length; i++) {
            s += fields[i];
        }
        return s;
    }

    public String explicit(String[] fields) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i ++) {
            sb.append(fields[i]);
        }

        return sb.toString();
    }

}
