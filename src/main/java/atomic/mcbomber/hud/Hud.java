package atomic.mcbomber.hud;

import meteordevelopment.meteorclient.systems.hud.HUD;
import meteordevelopment.meteorclient.systems.hud.modules.DoubleTextHudElement;

public class Hud extends DoubleTextHudElement {
    public String text = "0";
    public Hud() {
        super(HUD.get(), "bases-hud", "Displays the number of bases around you", "Bases found: ", false);
    }

    @Override
    public String getRight() {
        return this.text;
    }
}
