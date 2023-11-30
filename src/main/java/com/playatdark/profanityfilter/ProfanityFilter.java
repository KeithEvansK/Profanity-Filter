package com.playatdark.profanityfilter;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ProfanityFilter extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic

        //Register the listener to read chat entered by the player in MyListener.java.
        Bukkit.getServer().getPluginManager().registerEvents(new MyListener(), this);

        this.saveDefaultConfig(); //save the config file from the .jar into its plugin folder. Will not overwrite.

        //
        badWords badWords = new badWords(this);

        //Call loadBadWords() from badWords.java | Load bad words list from the config.
        badWords.loadBadWords();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }


}

