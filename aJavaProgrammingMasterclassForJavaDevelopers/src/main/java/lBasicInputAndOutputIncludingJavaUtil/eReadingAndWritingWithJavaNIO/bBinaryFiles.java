package lBasicInputAndOutputIncludingJavaUtil.eReadingAndWritingWithJavaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class bBinaryFiles {

    public static void main(String[] args) {
        //Writing and Reading binary files with java.nio
        try (FileOutputStream binFile = new FileOutputStream("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/eReadingAndWritingWithJavaNIO/data.dat");
             FileChannel binChannel = binFile.getChannel()){

            //Writing the data
            byte[] outputByte = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(outputByte.length);
            buffer.put(outputByte);

            buffer.flip();
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            //Reading the data
            RandomAccessFile ra = new RandomAccessFile("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/eReadingAndWritingWithJavaNIO/data.dat", "rwd");
            FileChannel channel = ra.getChannel();
            outputByte[0]  = 'a';
            outputByte[1]  = 'b';
            buffer.flip();
            long numBytesRead = channel.read(buffer);
            if(buffer.hasArray()) {
                System.out.println("byte buffer = " + new String(buffer.array()));
            }
            //Absolute read
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt(0));
            System.out.println(intBuffer.getInt());

            //Relative read
            //            intBuffer.flip();
            //            numBytesRead = channel.read(intBuffer);
            //            intBuffer.flip();
            //            System.out.println(intBuffer.getInt());
            //            intBuffer.flip();
            //            numBytesRead = channel.read(intBuffer);
            //            intBuffer.flip();
            //            System.out.println(intBuffer.getInt());
            channel.close();
            ra.close();


        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
