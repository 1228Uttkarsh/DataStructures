
package Tree;
import java.io.IOException;
import java.util.*;

public class prac {
    static class ProcessSchedule {
        public ProcessSchedule(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int startTime;
        public int endTime;
    }
    
    static class Dependency {
        public Dependency(int pid1, int pid2) {
            this.pid1 = pid1;
            this.pid2 = pid2;
        }
        public int pid1;
        public int pid2;
    }
    static class Scheduler {
        private Vector<ProcessSchedule> processes;
        private Vector<Dependency> dependencies;
            
        public Scheduler(Vector<ProcessSchedule> processes, Vector<Dependency> dependencies) {
            /* implement constructor */
            this.processes = processes;
            this.dependencies = dependencies;
            // Sort the processes in ascending order by start time.
        //    processes.sort((p1, p2) -> Integer.compare(p1.startTime, p2.startTime));
        }
        public void PrintSchedule() {
            /* write code here */
            Vector<Integer> topologicalOrder = topologicalSort();
            if (topologicalOrder.isEmpty()) {
                System.out.println("IMPOSSIBLE");
                return;
            }
           for (int pid : topologicalOrder) {
            ProcessSchedule processSchedule = processes.get(pid);

            // Find the earliest time at which the process can start.
            int startTime = processSchedule.startTime;
            for (Dependency dependency : dependencies) {
                if (dependency.pid2 == pid) {
                    startTime = Math.max(startTime, processes.get(dependency.pid1).endTime + 1);
                }
            }

            // Find the latest time at which the process can end.
            int endTime = processSchedule.endTime;
            for (Dependency dependency : dependencies) {
                if (dependency.pid1 == pid) {
                    endTime = Math.min(endTime, processes.get(dependency.pid2).startTime - 1);
                }
            }

            // Schedule the process to start and end at the calculated times.
            processSchedule.startTime = startTime;
            processSchedule.endTime = endTime;

            System.out.println(processSchedule.startTime + " " + processSchedule.endTime);
        }
    }
            private Vector<Integer> topologicalSort() {
        // Create a map to store the in-degree of each process.
        Map<Integer, Integer> inDegreeMap = new HashMap<>();
            for (Dependency dependency : dependencies) {
                inDegreeMap.put(dependency.pid2, inDegreeMap.getOrDefault(dependency.pid2, 0) + 1);
                 }
                                                        
        // Create a queue to store the processes with zero in-degree.
        Queue<Integer> zeroInDegreeQueue = new LinkedList<>();
        for (int pid = 0; pid < processes.size(); pid++) {
            if (inDegreeMap.getOrDefault(pid, 0) == 0) {
                zeroInDegreeQueue.add(pid);
            }
        }
        Vector<Integer> topologicalOrder = new Vector<>();
        while (!zeroInDegreeQueue.isEmpty()) {
            // Get the next process with zero in-degree.
            int pid = zeroInDegreeQueue.poll();
            // Add the process to the topological order.
             topologicalOrder.add(pid);

for (Dependency dependency : dependencies) {
    if (dependency.pid1 == pid) {
        inDegreeMap.put(dependency.pid2, inDegreeMap.get(dependency.pid2) - 1);
    if (inDegreeMap.get(dependency.pid2) == 0) {
        zeroInDegreeQueue.add(dependency.pid2);
        }
    }
}
  
        }

return topologicalOrder;
}
    }
public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        scanner.nextLine();

        for (int line = 0; line < lines; line++) {
            int numProcesses = scanner.nextInt();
            int numDependencies = scanner.nextInt();
            scanner.nextLine();
            
            Vector<ProcessSchedule> processes = new Vector<>();
            for (int i = 0; i < numProcesses; i++) {
                int startTime = scanner.nextInt();
                int endTime = scanner.nextInt();
                scanner.nextLine();
                ProcessSchedule processSchedule = new ProcessSchedule(startTime, endTime);
                processes.add(processSchedule);
            }
Vector<Dependency> dependencies = new Vector<>();
            for (int i = 0; i < numDependencies; i++) {
                int pid1 = scanner.nextInt();
                int pid2 = scanner.nextInt();
                scanner.nextLine();
                Dependency dependency = new Dependency(pid1, pid2);
                dependencies.add(dependency);
            }
            Scheduler scheduler = new Scheduler(processes, dependencies);
            scheduler.PrintSchedule();
        }
    }
}