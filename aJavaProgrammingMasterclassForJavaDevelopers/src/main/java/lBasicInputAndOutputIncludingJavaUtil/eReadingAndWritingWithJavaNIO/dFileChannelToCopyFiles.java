package lBasicInputAndOutputIncludingJavaUtil.eReadingAndWritingWithJavaNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;

public class dFileChannelToCopyFiles {

    public static void main(String[] args) {
        //Pipes with Threads
        try {
            Pipe pipe = Pipe.open();
            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i = 0; i < 10; i++) {
                            String currentTime = "The time is: " + System.currentTimeMillis();
                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while(buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i = 0; i < 10; i++) {
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader Thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();
        } catch(IOException e) {
            e.printStackTrace();
        }
        //Using FileChannel to copy a file
//        try (FileOutputStream binFile = new FileOutputStream("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/eReadingAndWritingWithJavaNIO/data.dat");
//             FileChannel binChannel = binFile.getChannel()) {
//
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//
//            byte[] outputByte = "Hello World!".getBytes();
//            byte[] outputByte2 = "Nice to meet you.".getBytes();
//            buffer.put(outputByte);
//            long int1Pos = outputByte.length;
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98765);
//            buffer.put(outputByte2);
//            long int3Pos = int2Pos + Integer.BYTES + outputByte2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//            binChannel.write(buffer);
//
//            RandomAccessFile ra = new RandomAccessFile("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/eReadingAndWritingWithJavaNIO/data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//
//            //Reading integers in inverse order
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int3 = " + readBuffer.getInt());
//            readBuffer.flip();
//
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int2 = " + readBuffer.getInt());
//            readBuffer.flip();
//
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int1 = " + readBuffer.getInt());
//
//            RandomAccessFile copyFile = new RandomAccessFile("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/eReadingAndWritingWithJavaNIO/datacopy.dat", "rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0);
////            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
//            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
//            System.out.println("Num transferred = " + numTransferred);
//
//            channel.close();
//            ra.close();
//            copyChannel.close();
//
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
    }
}
