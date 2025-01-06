/*
 * This source file was generated by the Gradle 'init' task
 */
package org.test;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Normalizer {
    public static String normalizeJDK(String key) {
        Objects.requireNonNull(key);
        int len = key.length();
        if (len == 0) {
            return key;
        }
        char[] b = key.toCharArray();
        if (b[0] >= 'a' && b[0] <= 'z') {
            b[0] = (char)(b[0] - ('a' - 'A'));
        } else if (b[0] == '\r' || b[0] == '\n')
            throw new IllegalArgumentException("illegal character in key");

        for (int i=1; i<len; i++) {
            if (b[i] >= 'A' && b[i] <= 'Z') {
                b[i] = (char) (b[i] + ('a' - 'A'));
            } else if (b[i] == '\r' || b[i] == '\n')
                throw new IllegalArgumentException("illegal character in key");
        }
        return new String(b);
    }
    public static String normalizeOption1(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        int i = 0;
        for(;i<len;i++) {
            char c = key.charAt(i);
            if(c=='\r' || c=='\n')
                throw new IllegalArgumentException("illegal character in key");
            else if (i==0) {
                if(!Character.isUpperCase(c)) {
                    break;
                }
            } else {
                if(!Character.isLowerCase(c)) {
                    break;
                }
            }
        }
        if(i==len) return key;
        char[] b = key.toCharArray();
        for(;i<len;i++) {
            b[i] = i==0 ? Character.toUpperCase(b[i]) : Character.toLowerCase(b[i]);
        }
        return new String(b);
    }
    private static boolean isUpper(char c) {
        return c>='A' && c<='Z';
    }
    private static boolean isLower(char c) {
        return c>='a' && c<='z';
    }
    private static boolean isUpper(byte c) {
        return c>='A' && c<='Z';
    }
    private static boolean isLower(byte c) {
        return c>='a' && c<='z';
    }
    private static byte toUpper(byte c) {
        return (byte)(c>='a' && c<='z' ? 'A'+(c-'a') : c); 
    }
    private static byte toLower(byte c) {
        return (byte)(c>='A' && c<='Z' ? 'a'+(c-'A') : c); 
    }
    private static char toUpper(char c) {
        return (char)(c>='a' && c<='z' ? 'A'+(c-'a') : c); 
    }
    private static char toLower(char c) {
        return (char)(c>='A' && c<='Z' ? 'a'+(c-'A') : c); 
    }
    public static String normalizeOption2(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        int i = 0;
        for(;i<len;i++) {
            char c = key.charAt(i);
            if(c=='\r' || c=='\n')
                throw new IllegalArgumentException("illegal character in key");
            else if (i==0) {
                if(!isUpper(c)) {
                    break;
                }
            } else {
                if(!isLower(c)) {
                    break;
                }
            }
        }
        if(i==len) return key;
        char[] b = key.toCharArray();
        for(;i<len;i++) {
            b[i] = i==0 ? Character.toUpperCase(b[i]) : Character.toLowerCase(b[i]);
        }
        return new String(b);
    }
    public static String normalizeOption3(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        int i = 0;
        for(;i<len;i++) {
            char c = key.charAt(i);
            if(c=='\r' || c=='\n')
                throw new IllegalArgumentException("illegal character in key");
            else if (i==0) {
                if(!isUpper(c)) {
                    break;
                }
            } else {
                if(!isLower(c)) {
                    break;
                }
            }
        }
        return Character.toUpperCase(key.charAt(0))+key.substring(1).toLowerCase();
    }
    public static String normalizeOption4(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        int i = 0;
        for(;i<len;i++) {
            char c = key.charAt(i);
            if(c=='\r' || c=='\n')
                throw new IllegalArgumentException("illegal character in key");
            else if (i==0) {
                if(!isUpper(c)) {
                    break;
                }
            } else {
                if(!isLower(c)) {
                    break;
                }
            }
        }
        byte[] b = key.getBytes(StandardCharsets.US_ASCII);
        for(;i<len;i++) {
            b[i] = i==0 ? toUpper(b[i]) : toLower(b[i]);
        }
        return new String(b,StandardCharsets.US_ASCII);
    }
    public static String normalizeOption5(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        byte[] b = key.getBytes(StandardCharsets.US_ASCII);
        int i = 0;
        for(;i<len;i++) {
            byte c = b[i];
            if(c=='\r' || c=='\n')
                throw new IllegalArgumentException("illegal character in key");
            else if (i==0) {
                if(!isUpper(c)) {
                    break;
                }
            } else {
                if(!isLower(c)) {
                    break;
                }
            }
        }
        if(i==len) return key;
        for(;i<len;i++) {
            b[i] = i==0 ? toUpper(b[i]) : toLower(b[i]);
        }
        return new String(b,StandardCharsets.US_ASCII);
    }
    static char[] buffer = new char[64];
    public static String normalizeOption6(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        if(len>buffer.length) {
            buffer = new char[buffer.length*2];
        }
        key.getChars(0, len, buffer, 0);
        int i = 0;
        for(;i<len;i++) {
            char c = buffer[i];
            if(c=='\r' || c=='\n')
                throw new IllegalArgumentException("illegal character in key");
            else if (i==0) {
                if(!isUpper(c)) {
                    break;
                }
            } else {
                if(!isLower(c)) {
                    break;
                }
            }
        }
        if(i==len) return key;
        for(;i<len;i++) {
            buffer[i] = i==0 ? Character.toUpperCase(buffer[i]) : Character.toLowerCase(buffer[i]);
        }
        return new String(buffer,0,len);
    }
    public static String normalizeOption7(String key) {
        int len = key.length();
        boolean modified = false;
        if (len == 0) {
            return key;
        }
        char[] b = key.toCharArray();
        if (b[0] >= 'a' && b[0] <= 'z') {
            b[0] = (char)(b[0] - ('a' - 'A'));
            modified=true;
        } else if (b[0] == '\r' || b[0] == '\n')
            throw new IllegalArgumentException("illegal character in key");

        for (int i=1; i<len; i++) {
            if (b[i] >= 'A' && b[i] <= 'Z') {
                b[i] = (char) (b[i] + ('a' - 'A'));
                modified=true;
            } else if (b[i] == '\r' || b[i] == '\n')
                throw new IllegalArgumentException("illegal character in key");
        }
        if(!modified) return key;
        return new String(b);
    }
    public static String normalizeOption8(String key) {
        int len = key.length();
        if (len == 0) {
            return key;
        }
        int i=0;
        char c = key.charAt(0);
        if (c == '\r' || c == '\n')
            throw new IllegalArgumentException("illegal character in key");
        if(c>='a' && c<='z') {
            // start with lowercase
        } else {
            i++;
            for(;i<len;i++) {
                c = key.charAt(i);
                if (c == '\r' || c == '\n')
                    throw new IllegalArgumentException("illegal character in key");
                else if(c >= 'A' && c<='Z') {
                    break;
                }
            }
        }
        if(i==len) return key;

        char[] b = key.toCharArray();
        if(i==0) {
            b[0] = (char)(b[0] - ('a' - 'A'));
            i++;
        }
        for (;i<len; i++) {
            c = b[i];
            if(c>='A' && c<='Z') {
                b[i] = (char) (c+('a'-'A'));
            } else if (c == '\r' || c == '\n')
                throw new IllegalArgumentException("illegal character in key");
        }
        return new String(b);
    }
    public static String normalizeOption9(String key) {
        Objects.requireNonNull(key);
        int len = key.length();
        boolean modified = false;
        if (len == 0) {
            return key;
        }
        if(len>buffer.length) {
            buffer = new char[buffer.length*2];
        }
        key.getChars(0,len, buffer, 0);
        char[] b = buffer;
        char c = buffer[0];
        if (c >= 'a' && c <= 'z') {
            b[0] = (char)(c - ('a' - 'A'));
            modified=true;
        } else if (c == '\r' || c == '\n')
            throw new IllegalArgumentException("illegal character in key");

        for (int i=1; i<len; i++) {
            c = b[i];
            if (c >= 'A' && c <= 'Z') {
                b[i] = (char) (c + ('a' - 'A'));
                modified=true;
            } else if (c == '\r' || c == '\n')
                throw new IllegalArgumentException("illegal character in key");
        }
        if(!modified) return key;
        return new String(b);
    }
    public static String normalizeOption10(String key) {
        Objects.requireNonNull(key);
        int len = key.length();
        if (len == 0) {
            return key;
        }
        int i=0;
        char c;
        for(;i<len;i++) {
            c = key.charAt(i);
            if (i == 0 && isLower(c)) {
                break;
            } else if(i>0 && isUpper(c)) {
                break;
            } else if (c == '\r' || c == '\n')
                throw new IllegalArgumentException("illegal character in key");
        }
        if(i==len) return key;
        return Character.toUpperCase(key.charAt(0))+key.substring(1).toLowerCase();
    }
    public static String normalizeOption11(String key) {
        Objects.requireNonNull(key);
        if (key.length() == 0) {
            return key;
        }
        if(key.indexOf('\n')>=0 || key.indexOf('\r')>=0)
            throw new IllegalArgumentException("illegal character in key");
        return Character.toUpperCase(key.charAt(0))+key.substring(1).toLowerCase();
    }

}
