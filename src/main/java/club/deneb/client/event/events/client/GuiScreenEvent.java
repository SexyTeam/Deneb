package club.deneb.client.event.events.client;

import club.deneb.client.event.MinecraftEvent;
import net.minecraft.client.gui.GuiScreen;

/**
 * Created by 086 on 17/11/2017.
 */
public class GuiScreenEvent extends MinecraftEvent {

    private GuiScreen screen;

    public GuiScreenEvent(GuiScreen screen) {
        super();
        this.screen = screen;
    }

    public GuiScreen getScreen() {
        return screen;
    }

    public void setScreen(GuiScreen screen) {
        this.screen = screen;
    }

    public static class Displayed extends GuiScreenEvent {
        public Displayed(GuiScreen screen) {
            super(screen);
        }
    }

    public static class Closed extends GuiScreenEvent {
        public Closed(GuiScreen screen) {
            super(screen);
        }
    }

}
