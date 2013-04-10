package org.emamotor.hfdp.decorator.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class LowerCaseInputStreamTest {

    @Test
    public void test_txtを読込んで全て小文字に変換する() {

        int c;
        InputStream in = null;
        File testTxt = new File(this.getClass().getResource("/test.txt").getFile());

        try {

            in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(testTxt)
                    )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {}
            }
        }

    }

}
