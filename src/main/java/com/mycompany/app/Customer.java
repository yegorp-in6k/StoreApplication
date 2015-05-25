package com.mycompany.app;

/**
 * Created by Егор on 24.05.2015.
 */
public class Customer {
    public void selectArtist() {
        boolean notExit = true;
        while(notExit) {
            ur = userChoice();
            switch(ur) {
                case 1: selectAlbum();break;
                case 2: deleteAlbum();break;
                case 0: notExit = false;break;
            } // switch
        } // while
    } // selectArtist

    public void selectAlbum() {
}
