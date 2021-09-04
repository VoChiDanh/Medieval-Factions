package dansplugins.factionsystem.externalapi;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface IMF_Faction {
    String getName();
    UUID getOwner();
    boolean isMember(Player player);
    boolean isOfficer(Player player);
}