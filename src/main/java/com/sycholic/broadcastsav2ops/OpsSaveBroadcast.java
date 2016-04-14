/*

Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International (CC BY-NC-SA 4.0) license:

This is a human-readable summary of (and not a substitute for) the license found under
http://creativecommons.org/licenses/by-nc-sa/4.0/legalcode

You are free to:

    Share — copy and redistribute the material in any medium or format
    Adapt — remix, transform, and build upon the material

    The licensor cannot revoke these freedoms as long as you follow the license terms.

Under the following terms:

    Attribution — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.

    NonCommercial — You may not use the material for commercial purposes. This means you can never accept any form of monetary gain.

    ShareAlike — If you remix, transform, or build upon the material, you must distribute your contributions under the same license as the original.

    No additional restrictions — You may not apply legal terms or technological measures that legally restrict others from doing anything the license permits.

Notices:

    You do not have to comply with the license for elements of the material in the public domain or where your use is permitted by an applicable exception or limitation.
    No warranties are given. The license may not give you all of the permissions necessary for your intended use. For example, other rights such as publicity, privacy, or moral rights may limit how you use the material.


Author: Sycholic @ https://www.spigotmc.org/members/sycholic.40800/
 */
package com.sycholic.broadcastsav2ops;

import org.bukkit.plugin.java.JavaPlugin; 
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;

/**
 *
 * @author sycholic
 * 
 */
public class OpsSaveBroadcast extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        }
    
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void broadcastOps(WorldSaveEvent e) {
        for (int i = 0; i < e.getWorld().getPlayers().size(); i++) {
            if (e.getWorld().getPlayers().get(i).isOp()) {
                e.getWorld().getPlayers().get(i).sendMessage("Server is being saved now.");
            }
        }
        }
    }