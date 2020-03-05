package com.company;

/*

1228 Human class interfaces

Add as many interfaces as possible to the Human class, but not to become an abstract class.
Adding methods to the Human class is forbidden.

Requirements:
1. The Solution class must contain a Worker interface with the void workLazy () method.
2. The Solution class must contain the Businessman interface with the void workHard () method.
3. The Solution class must contain a Secretary interface with the void workLazy () method.
4. The Solution class must contain a Miner interface with the void workVeryHard () method.
5. The Solution class must contain the Human class with the methods: void workHard () and void workLazy ().
6. The Human class must implement three interfaces.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}



