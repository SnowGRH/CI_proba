package logikaioop;

import java.util.Objects;


public class View {
    private String s = "Az 1. állítás!", s2 = "A 2. állítás!", s3 = "A 3. állítás";

    public View() {
        kiir();
    }

    public String getS() {
        return s;
    }

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return s + "\n" + s2 + "\n" + s3;
    }
    
    public void kiir(){
        System.out.println(toString());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final View other = (View) obj;
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        if (!Objects.equals(this.s2, other.s2)) {
            return false;
        }
        return Objects.equals(this.s3, other.s3);
    }
    
    
    
}
