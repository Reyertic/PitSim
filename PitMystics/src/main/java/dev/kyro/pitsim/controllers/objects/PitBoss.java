package dev.kyro.pitsim.controllers.objects;

import dev.kyro.pitsim.enums.SubLevel;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.npc.skin.Skin;
import net.citizensnpcs.npc.skin.SkinnableEntity;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public abstract class PitBoss {
    public Player target;
    public SubLevel subLevel;

    public PitBoss(Player target, SubLevel subLevel) {
        this.target = target;
        this.subLevel = subLevel;
    }

    public abstract void onAttack() throws Exception;

    public abstract void onDefend();

    public abstract void onDeath();

    public abstract Player getEntity();

    public static void skin(NPC npc, String name) {
        npc.data().setPersistent(NPC.PLAYER_SKIN_UUID_METADATA, name);
        npc.data().setPersistent(NPC.PLAYER_SKIN_USE_LATEST, false);

        // send skin change to online players by removing and adding this fake player
        if (npc.isSpawned()) {
            Location loc = npc.getStoredLocation();
            npc.despawn();
            npc.spawn(loc);
        }
    }

    public static void skin(NPC npc, String name, String texture_value, String texture_signature) {
        npc.data().setPersistent(NPC.PLAYER_SKIN_UUID_METADATA, name);
        npc.data().setPersistent(NPC.PLAYER_SKIN_TEXTURE_PROPERTIES_METADATA, texture_value);
        npc.data().setPersistent(NPC.PLAYER_SKIN_TEXTURE_PROPERTIES_SIGN_METADATA, texture_signature);
        npc.data().setPersistent(NPC.PLAYER_SKIN_USE_LATEST, false);


        // send skin change to online players by removing and adding this fake player
        if (npc.isSpawned()) {
            Location loc = npc.getStoredLocation();
            npc.despawn();
            npc.spawn(loc);
        }


        if (npc.isSpawned()) {

            SkinnableEntity skinnable = npc.getEntity() instanceof SkinnableEntity ? (SkinnableEntity) npc.getEntity() : null;
            if (skinnable != null) {
                Skin.get(skinnable).applyAndRespawn(skinnable);

            }
        }
    }




}
