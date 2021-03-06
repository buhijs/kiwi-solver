package kiwi.search;

public class SearchStats {
  public long startTime; 
  public boolean completed;
  public int nNodes;
  public int nFails;
  public int nSolutions;
  
  @Override 
  public String toString() {
    StringBuffer bf = new StringBuffer();
    bf.append(completed ? "Complete search\n" : "Incomplete search\n");
    bf.append("#solutions  : " + nSolutions + "\n");
    bf.append("#nodes      : " + nNodes + "\n");
    bf.append("#fails      : " + nFails + "\n");
    return bf.toString();
  }
}
