package util;

import java.util.Objects;

public class Test {
    private String test;
    private String pass;

    public Test(String w, String e) {
        this.test = w;
        this.pass = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Test that = (Test) o;
        return Objects.equals(test, that.test)
                && Objects.equals(pass, that.pass);
    }
}
