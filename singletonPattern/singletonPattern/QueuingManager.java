package singletonPattern;
import java.util.HashMap;
import java.util.Map;

public class QueuingManager {
    private static QueuingManager instance;
    private int currentQueueNum;
    private int hdStationNum=3;
    private Map<Integer, Integer> hdStationsQueue;

    private QueuingManager(){
        currentQueueNum = 0;
        hdStationsQueue = new HashMap<>();
        for(int i = 1; i <= hdStationNum; i++){
            hdStationsQueue.put(i,null);
        }
    }

    public static QueuingManager getInstance() {

        if(instance == null){
            instance = new QueuingManager();
        }
        return instance;
    }

    public int getCurrentQueueNum() {
        return currentQueueNum;
    }

    public void setCurrentQueueNum(int currentQueueNum) {
        this.currentQueueNum = currentQueueNum;
    }

    public int getNextQueueNum() {
        return currentQueueNum+=1;
    }

    public Map<Integer, Integer> getHdStations() {
        return hdStationsQueue;
    }

    public void resetQueueNum(int newQueueNum){
        currentQueueNum = newQueueNum-1;
        System.out.println("Queue number has been reset to: " + newQueueNum);
    }

    public void serve(int stationToServe, int queueNum) {
        if(hdStationsQueue.get(stationToServe) != null){
            System.out.println("Station " + stationToServe + " is currently busy. Try another station number. " +
                    "\nOr wait for available station, Thank you.");
            currentQueueNum-=1;
        }
        else{
            hdStationsQueue.replace(stationToServe,queueNum);
            System.out.println("Successful. Enjoy the service!");
        }
    }

    public void finish(int stationToFinish) {
        hdStationsQueue.replace(stationToFinish,null);
    }

    public void printHDStatus() {
        for(int i = 1; i <= hdStationNum; i++){
            System.out.println("Station " + i + " serving queue no.: "
                    + (hdStationsQueue.containsKey(i)&& hdStationsQueue.get(i) != null
                    ? hdStationsQueue.get(i) + " [busy]": "none [available]"));
        }
    }

    public void addHDStation() {
        hdStationNum+=1;
        hdStationsQueue.put(hdStationNum,null);
    }


}
