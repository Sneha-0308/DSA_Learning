package org.example;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmaps {

    public static void main(String[] args){
        ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
        //writer thread
        Thread writer=new Thread(()->{
            for(int i=0;i<5;i++){
                map.put(i,"Value-" + i);
            }
        });
        Thread reader =new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Key: " + i + " => " + map.get(i));
            }
        });
        writer.start();
        reader.start();

    }
}


/**NOTES>>>>>>>>>...
CAS (Compare-And-Swap) is a CPU-level atomic instruction.
 if (memoryValue == expectedValue) {
 memoryValue = newValue;
 return true;
 } else {
 return false;
 }
CAS is used only in when inserting into an empty bucket
 If two threads try to put into the same empty bucket:
    Only one succeeds.
    Other retries.
 Where locking happens (only if needed)
 If the bucket is not empty (collision case),


 Locking is done only on that bucket’s head node, not on the whole map.
 👉 Other buckets remain free for other threads.
 Reads (No Locking)

 🔹 5. Why is it faster?

 Less Lock Contention: only lock per bucket, not entire map.

 CAS for empty insert: avoids lock completely.

 Lock-free Reads: majority of operations (gets) don’t block.

 Parallel Resizing: multiple threads can help resize.

 One-liner summary for interview:
 In Java 8, ConcurrentHashMap uses CAS for inserting into empty buckets (no locks), and only synchronizes at bucket-level when handling collisions. Reads are lock-free using volatile fields. This fine-grained locking and CAS mechanism make it much faster than synchronized collections like Hashtable.
 */