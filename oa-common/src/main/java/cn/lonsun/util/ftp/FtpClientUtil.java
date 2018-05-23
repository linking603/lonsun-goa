package cn.lonsun.util.ftp;

import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;
import java.io.InputStream;

public class FtpClientUtil {
    private String serverIp;
    private int serverPort;
    private String account;
    private String pwd;

    public FtpClientUtil(String serverIp, int serverPort, String account, String pwd) {
        this.serverIp = serverIp;
        this.serverPort = serverPort;
        this.account = account;
        this.pwd = pwd;
    }

    public boolean Ftp(InputStream in, String filename, String desfileurl) {
        FTPClient ftpClient = new FTPClient();
        boolean issuccess = false;
        try {
            ftpClient.connect(serverIp, serverPort);
            ftpClient.login(account, pwd);
            ftpClient.enterLocalPassiveMode();//设置为被动模式
            ftpClient.setBufferSize(1024);
            ftpClient.setControlEncoding("GBK");
            //设置文件类型（二进制）
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
            ftpClient.makeDirectory(desfileurl);//判断ftp服务器是否存在destfileurl目录，不存在则创建
            ftpClient.changeWorkingDirectory(desfileurl);//将文件保存到destfileurl
            //issuccess = ftpClient.storeFile(filename, in);
            issuccess = ftpClient.storeFile(new String(filename.getBytes("GBK"), "iso-8859-1"), in);//支持中文文件名
        } catch (IOException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            try {
                ftpClient.disconnect();
            } catch (IOException e) {
            }
        }
        return issuccess;
    }
}
