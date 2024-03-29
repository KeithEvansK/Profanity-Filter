package com.playatdark.profanityfilter;

import org.bukkit.configuration.file.FileConfiguration;


// This class is used to load the badwords from the config file and put them into the array so we can use it to check the chat sent by the player.
public class badWords {
    public static String[] badWordsArray = new String[0]; //Empty array we will fill with bad words to check later from config.
    private ProfanityFilter plugin; //


    //
    public badWords(ProfanityFilter plugin){

        this.plugin = plugin; //

    }

    //Load the bad words from the config file, then load it into the bad words array.
     public void loadBadWords(){

            FileConfiguration config = plugin.getConfig(); //


            //loads the badwords from config file as a list, converts it to an array, and assigns it to badWordsArray.
            badWordsArray = config.getStringList("badwords").toArray(new String[0]);



    }

}
