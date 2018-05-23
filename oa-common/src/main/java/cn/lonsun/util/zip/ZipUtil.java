package cn.lonsun.util.zip;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

public class ZipUtil {
    public void compressByString(OutputStream outputStream, Map<String, byte[]> data) throws IOException {
        ZipOutputStream out = new ZipOutputStream(outputStream);
        Iterator it = data.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, byte[]> entry = (Map.Entry) it.next();
            String filename = entry.getKey();//如果文件名添加了路径，在zip文件里就会显示多层目录
            byte[] filedata = entry.getValue();
            out.putNextEntry(new ZipEntry(filename));
            out.write(filedata);
        }
        out.setEncoding("GB2312");//压缩文件的文件名带中文
        out.closeEntry();
        out.close();
        outputStream.flush();
        outputStream.close();
    }
}
