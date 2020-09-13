package lBasicInputAndOutputIncludingJavaUtil.cIntroductionToIO;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static final Map<Integer, Location> locations = new LinkedHashMap<>();
    private static final Map<Integer, IndexRecord> index = new HashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {
        //Using RandomAccessFile to write data to a file
        try (RandomAccessFile rao = new RandomAccessFile("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations_rand.dat", "rwd")) {
            rao.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
            rao.writeInt(locationStart);

            long indexStart = rao.getFilePointer();
            int startPointer = locationStart;
            rao.seek(startPointer);

            for(Location location : locations.values()) {
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();
                for(String direction : location.getExits().keySet()) {
                    if(!direction.equalsIgnoreCase("Q")) {
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString());

                IndexRecord record = new IndexRecord(startPointer, (int) rao.getFilePointer() - startPointer);
                index.put(location.getLocationID(), record);

                startPointer = (int) rao.getFilePointer();
            }

            rao.seek(indexStart);
            for(Integer locationID : index.keySet()) {
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
        }
        //Using ObjectOutputStream to write data to a file
//        try (ObjectOutputStream locFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations.dat"))))) {
//            for(Location location : locations.values()) {
//                locFile.writeObject(location);
//            }
//        }
        //Using DataOutputStream, BufferedOutputStream and FileOutputStream to write data to a file
//        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations.dat"))))) {
//            for (Location location : locations.values()) {
//                locFile.writeInt(location.getLocationID());
//                locFile.writeUTF(location.getDescription());
//                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
//                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
//                locFile.writeInt(location.getExits().size() - 1);
//                for (String direction : location.getExits().keySet()) {
//                    if (!direction.equalsIgnoreCase("Q")) {
//                        System.out.println("\t\t" + direction + ", " + location.getExits().get(direction));
//                        locFile.writeUTF(direction);
//                        locFile.writeInt(location.getExits().get(direction));
//                    }
//                }
//            }
//        }
    }




    static {
        //Using RandomAccessFile to read data from a file
        try{
            ra = new RandomAccessFile("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations_rand.dat", "rwd");
            int numLocations = ra.readInt();
            long locationStartPoint = ra.readInt();

            while(ra.getFilePointer() < locationStartPoint) {
                int locationId = ra.readInt();
                int locationStart = ra.readInt();
                int locationLength = ra.readInt();

                IndexRecord record = new IndexRecord(locationStart, locationLength);
                index.put(locationId, record);
            }
        } catch(IOException e) {
            System.out.println("IOException in static initializer: " + e.getMessage());
        }
        //Using ObjectInputStream to read data from a file
//        try(ObjectInputStream locFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations.dat"))))) {
//            boolean eof = false;
//            while(!eof) {
//                try {
//                    Location location = (Location) locFile.readObject();
//                    System.out.println("Read Location " + location.getLocationID() + " : " + location.getDescription());
//                    System.out.println("Found " + location.getExits() + " exits");
//
//                    locations.put(location.getLocationID(), location);
//                } catch(InvalidClassException e) {
//                    System.out.println("InvalidClassException " + e.getMessage());
//                } catch(IOException e) {
//                    eof = true;
//                } catch(ClassNotFoundException e) {
//                    System.out.println("ClassNotFoundException " + e.getMessage());
//                }
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
        //Using DataInputStream, BufferedInputStream and FileInputStream to read data from a file
//        try(DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations.dat"))))) {
//            boolean eof = false;
//            while(!eof) {
//                try {
//                    Map<String, Integer> exits = new LinkedHashMap<>();
//                    int locID = locFile.readInt();
//                    String description = locFile.readUTF();
//                    int numExits = locFile.readInt();
//                    System.out.println("Read location " + locID + " : " + description);
//                    System.out.println("Found " + numExits + " exits");
//                    for(int i = 0; i < numExits; i++) {
//                        String direction = locFile.readUTF();
//                        int destination = locFile.readInt();
//                        exits.put(direction, destination);
//                        System.out.println("\t\t" + direction + ", " + destination);
//                    }
//                    locations.put(locID, new Location(locID, description, exits));
//                } catch(IOException e) {
//                    eof = true;
//                }
//            }
//        } catch(IOException e) {
//            System.out.println("IO Exception");
//        }
        //Using Scanner, BufferedReader and FileReader to read data from file
//        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/locations_big.txt"))))) {
//            scanner.useDelimiter(",");
//            while(scanner.hasNextLine()) {
//                int location = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + location + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(location, new Location(location, description, tempExit));
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//
//        //Now read the exits
//        try(BufferedReader dirFile = new BufferedReader(new FileReader(new File("aJavaProgrammingMasterclassForJavaDevelopers/src/main/resources/lBasicInputAndOutputIncludingJavaUtil/cIntroductionToIO/directions_big.txt")))) {
//            String input;
//            while((input = dirFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
    }

    public Location getLocation(int locationId) throws IOException {
        IndexRecord record = index.get(locationId);
        ra.seek(record.getStartByte());
        int id = ra.readInt();
        String description = ra.readUTF();
        String exits = ra.readUTF();
        String[] exitPart = exits.split(",");

        Location location = new Location(locationId, description, null);

        if(locationId != 0) {
            for(int i = 0; i < exitPart.length; i++) {
                System.out.println("exitPart = " + exitPart[i]);
                System.out.println("exitPart[+1] = " + exitPart[i + 1]);
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }

        return location;
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }

    public void close() throws IOException {
        ra.close();
    }
}
