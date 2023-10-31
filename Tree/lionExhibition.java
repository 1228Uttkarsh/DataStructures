package Tree;
import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;

class lionDescription {

public String name;

public int height;

}

class lionSchedule {

public String name;

public int enterTime;

public int exitTime;

}

class lionCompetition {

class lion {

String name;

int height = -1;

int enterTime = -1;

int exitTime = -1;

lion( String name, int height ) {

this.name = name;

this.height = height;

}

lion( int height ) {

this.height = height;

}

@Override

public String toString() {

return "(name='" + name +

", height=" + height +

", enterTime=" + enterTime +

", exitTime=" + exitTime + ")";

}

}

final PriorityQueue<lion> h1 = new PriorityQueue<>( Comparator.comparingInt( e -> e.enterTime ) );

// Our team

final TreeMap<Integer, lion> t1 = new TreeMap<>();

final PriorityQueue<lion> h2 = new PriorityQueue<>( Comparator.comparingInt( e -> e.exitTime ) );

// Other team

final TreeMap<Integer, lion> t2 = new TreeMap<>();

public lionCompetition(List<lionDescription> lion, List<lionSchedule> schedule) {

TreeMap<String, lion> E = new TreeMap<>();

/* Enter your code here. */

lion.forEach( e -> E.put( e.name, new lion( e.name, e.height ) ) );

schedule.forEach( e -> {

lion e1 = E.get( e.name );

e1.enterTime = e.enterTime;

e1.exitTime = e.exitTime;

} );

h1.addAll( E.values() );

}

public void lionEntered(int currentTime, int height) {

if (!h1.isEmpty() && h1.peek().enterTime == currentTime && h1.peek().height == height) {

lion e = h1.poll();

t1.put(e.height, e);

h2.add(e);

} else {

lion e = new lion(height);

t2.put(height, e);

}

}

public void lionLeft(int currentTime, int height) {

if (!h2.isEmpty() && h2.peek().exitTime == currentTime && h2.peek().height == height) {

lion e = h2.poll();

if (t1.containsValue(e)) {

t1.entrySet().removeIf(entry -> entry.getValue().equals(e));

}

} else {

t2.remove(height);

}

}

public List<String> getBiggestElephants()

{

ArrayList<String> S = new ArrayList<>();

if ( t2.isEmpty() ) return S;

/* Enter your code here. */

Integer k = t2.lastKey();

System.out.println( t2 );

if ( t1.lastKey() < k ) return S;

t1.tailMap( k ).values().forEach( e -> S.add( e.name ) );

S.sort( String::compareTo );

return S;

}

}

public class lionExhibition {

public static void main(String args[]) throws Exception {

Scanner scanner = new Scanner(System.in);

String operation;

List<lionDescription> descriptions = new ArrayList<lionDescription>();

List<lionSchedule> schedule = new ArrayList<lionSchedule>();

do

{

operation = scanner.next();

if (operation.equals("definition"))

{

lionDescription description = new lionDescription();

description.name = scanner.next();

description.height = scanner.nextInt();

descriptions.add(description);

}

if (operation.equals("schedule"))

{

lionSchedule scheduleEntry = new lionSchedule();

scheduleEntry.name = scanner.next();

scheduleEntry.enterTime = scanner.nextInt();

scheduleEntry.exitTime = scanner.nextInt();

schedule.add(scheduleEntry);

}

} while (!operation.equals("start"));

lionCompetition elephantCompetition = new lionCompetition(descriptions, schedule);

do

{

int currentTime = scanner.nextInt();

operation = scanner.next();

if (operation.equals("enter"))

{

int size = scanner.nextInt();

elephantCompetition.lionEntered(currentTime, size);

}

if (operation.equals("exit"))

{

int size = scanner.nextInt();

elephantCompetition.lionLeft(currentTime, size);

}

if (operation.equals("inspect"))

{

List<String> elephants = elephantCompetition.getBiggestElephants();

System.out.print(elephants.size());

for (String name : elephants) {

System.out.print(" " + name);

}

System.out.println();

}

} while (!operation.equals("end"));

}

}

