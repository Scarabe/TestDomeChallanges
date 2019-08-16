public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        String[] names = new String[0];

        for (String name1 : names1) {
            boolean add = true;

            for (String name : names) {
                if(name!= null && name.equalsIgnoreCase(name1)){
                    add=false;
                    break;
                }
            }
            if(add){
                String[] newNames =  new String[names.length+1];
                for (int i = 0; i < names.length; i++) {
                    newNames[i] = names[i];
                }
                newNames[names.length] = name1;
                names = newNames.clone();
            }
        }

        for (String name2 : names2) {
            boolean add = true;

            for (String name : names) {
                if(name!= null && name.equalsIgnoreCase(name2)) {
                    add = false;
                    break;
                }
            }
            if(add){
                String[] newNames =  new String[names.length+1];
                for (int i = 0; i < names.length; i++) {
                    newNames[i] = names[i];
                }
                newNames[names.length] = name2;
                names = newNames.clone();
            }
        }


        return names;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}