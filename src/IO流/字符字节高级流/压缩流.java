package IO流.字符字节高级流;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class 压缩流 {
    public static void main(String[] args) throws IOException {
        /**解压缩包
         * //创建需要解压的压缩包
         * File f1=new File("C:\\Users\\电脑小白\\Desktop\\学习.zip");
         * //创建你要解压的目的地
         * File f2=new File("C:\\Users\\电脑小白\\Desktop\\学习");
         *upZIP(f1,f2);
         */

        /**生成文件压缩包
         *File f1 = new File("C:\\Users\\电脑小白\\Desktop\\学习\\学习\\演员.txt");
         * File f2 = new File("C:\\Users\\电脑小白\\Desktop\\学习(2).zip");
         *ZIP(f1, f2);
         * */

        /**生成文件夹压缩包
         */
        File file=new File("C:\\Users\\电脑小白\\Desktop\\学习\\学习");
        ZipOutputStream zip=new ZipOutputStream(new FileOutputStream("C:\\Users\\电脑小白\\Desktop\\学习(2).zip"));

        toZIP(file,zip,file.getName());
        zip.close();
    }

    private static void ZIP(File f1, File f2) throws IOException {
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(new File(f2,"")));
        ZipEntry entry = new ZipEntry("a.txt");
        zip.putNextEntry(entry);
        FileInputStream fis=new FileInputStream(f1);

        int b;
        while ((b=fis.read())!=-1){
            zip.write(b);
        }

        zip.closeEntry();
        zip.close();
    }

    private static void upZIP(File ZIP, File file) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(ZIP), Charset.forName("GBK"));
        ZipEntry Entry;

        while ((Entry = zis.getNextEntry()) != null) {
            System.out.println(Entry);
            if (Entry.isDirectory()) {
                File file1 = new File(file, Entry.toString());
                file1.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(file, Entry.toString()));
                int b;
                while ((b = zis.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }

    private static void toZIP(File file,ZipOutputStream zip,String name) throws IOException {
        File[] files = file.listFiles();

        for (File file1 : files) {
            if(file1.isFile()){
                ZipEntry entry=new ZipEntry(name+"\\"+file1.getName());
                zip.putNextEntry(entry);
                FileInputStream fis=new FileInputStream(file);
                int b;
                while ((b=fis.read())!=-1){
                    zip.write(b);
                }
                fis.close();
                zip.closeEntry();

            }else{
                toZIP(file1,zip,name+"\\"+file1.getName());
            }

        }
        zip.close();
    }
}
