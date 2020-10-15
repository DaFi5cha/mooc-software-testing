package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        int counter=0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g') {
                    counter++;
                    continue;
                }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') {
                    counter++;
                    continue;
                }
                return false;
            }
        }
        if(counter >= 1) {
            return true;
        }
        return false;
    }
}
