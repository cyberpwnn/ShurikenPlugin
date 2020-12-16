package pkg;

import com.google.gson.GsonBuilder;
import lombok.Data;
import ninja.bytecode.shuriken.bukkit.api.world.Area;
import ninja.bytecode.shuriken.bukkit.api.world.Explosion;
import ninja.bytecode.shuriken.bukkit.bukkit.plugin.Instance;
import ninja.bytecode.shuriken.bukkit.bukkit.plugin.ShurikenPlugin;
import ninja.bytecode.shuriken.bukkit.util.text.C;
import ninja.bytecode.shuriken.bukkit.util.text.TXT;
import org.bukkit.Bukkit;
import org.bukkit.entity.Donkey;

public class APlugin extends ShurikenPlugin {
    @Instance
    public static APlugin instance;

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String getTag(String subTag) {
        return TXT.makeTag(C.DARK_GRAY, C.BLUE, C.DARK_GRAY, C.GRAY, "APlugin");
    }
}
