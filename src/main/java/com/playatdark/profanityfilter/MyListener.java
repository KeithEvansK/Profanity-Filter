package com.playatdark.profanityfilter;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


//This class is used to listen to the onPlayerChat event. Code is triggered when any player uses the chat feature.
public class MyListener implements Listener {

    //triggered when a player chats.
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event){ //create the chat event
        Player player = event.getPlayer(); //assign the chatting player to a player object.


        //loop for each bad word in the array.
        for(String badWord : badWords.badWordsArray){


            //check if the bad word is contained in the message sent by the player.
            if(event.getMessage().toLowerCase().contains(badWord.toLowerCase())){

                //Cancel the message sent event.
                event.setCancelled(true);

                //Remind player to watch their language. Lets them know their message wasn't sent.
                player.sendMessage("Watch your language.");


                //Exit the loop, you only need to cancel the sent message one time.
                // If you don't do this, it will cancel every time they use a blocked word in a single sentence.
                break;

            }
        }
    }
}