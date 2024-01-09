package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BI12791 {
    public static class Album{
        int date;
        String name;
        Album(int d, String n){
            date = d;
            name = n;
        }
    }
    public static ArrayList<Album> setDavidBowieAlbumList(){
        ArrayList<Album> result = new ArrayList<>();
        result.add(new Album(1967, "DavidBowie"));
        result.add(new Album(1969 ,"SpaceOddity"));
        result.add(new Album(1970, "TheManWhoSoldTheWorld"));
        result.add(new Album(1971, "HunkyDory"));
        result.add(new Album(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"));
        result.add(new Album(1973, "AladdinSane"));
        result.add(new Album(1973, "PinUps"));
        result.add(new Album(1974, "DiamondDogs"));
        result.add(new Album(1975, "YoungAmericans"));
        result.add(new Album(1976, "StationToStation"));
        result.add(new Album(1977, "Low"));
        result.add(new Album(1977, "Heroes"));
        result.add(new Album(1979, "Lodger"));
        result.add(new Album(1980, "ScaryMonstersAndSuperCreeps"));
        result.add(new Album(1983, "LetsDance"));
        result.add(new Album(1984, "Tonight"));
        result.add(new Album(1987, "NeverLetMeDown"));
        result.add(new Album(1993, "BlackTieWhiteNoise"));
        result.add(new Album(1995, "1.Outside"));
        result.add(new Album(1997, "Earthling"));
        result.add(new Album(1999, "Hours"));
        result.add(new Album(2002, "Heathen"));
        result.add(new Album(2003, "Reality"));
        result.add(new Album(2013, "TheNextDay"));
        result.add(new Album(2016, "BlackStar"));
        return result;
    }
    public static void main(String args[]) throws IOException {
        ArrayList<Album> arrayList = setDavidBowieAlbumList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilderIn, stringBuilderOut;
        stringBuilderOut = new StringBuilder();
        StringTokenizer stringTokenizer;
        for(int i = 0 ; i < n ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;//매칭되는 앨범의 개수
            stringBuilderIn = new StringBuilder();
            for(int j = 0 ; j < arrayList.size() ; j++){
                if(start <= arrayList.get(j).date && arrayList.get(j).date <= end){
                    stringBuilderIn.append(arrayList.get(j).date + " " + arrayList.get(j).name);
                    stringBuilderIn.append('\n');
                    count++;
                }
                else if(arrayList.get(j).date > end){
                    break;
                }
            }
            if(count == 0){
                stringBuilderOut.append(0);
                stringBuilderOut.append('\n');
            }
            else{
                stringBuilderOut.append(count);
                stringBuilderOut.append('\n');
                stringBuilderOut.append(stringBuilderIn);
            }
        }
        System.out.println(stringBuilderOut);
    }
}
