package com.deneb.client.gui.component;

import com.deneb.client.Deneb;
import com.deneb.client.gui.Panel;
import com.deneb.client.gui.font.CFontRenderer;
import net.minecraft.client.Minecraft;

/**
 * Created by B_312 on 01/10/21
 */
public abstract class Component {
    public CFontRenderer font = Deneb.getINSTANCE().getFont();
    public Minecraft mc = Minecraft.getMinecraft();
    public int x,y,width,height;
    public Panel father;
    public boolean isToggled,isExtended;
    public boolean isHovered(int mouseX, int mouseY) {
        return mouseX >= Math.min(x,x + width) && mouseX <= Math.max(x,x+width)  && mouseY >= Math.min(y,y + height) && mouseY <= Math.max(y,y + height);
    }
    public abstract void render(int mouseX, int mouseY, float partialTicks);
    public abstract boolean mouseClicked(int mouseX, int mouseY, int mouseButton);
    public void mouseReleased(int mouseX, int mouseY, int state) { }
    public void keyTyped(char typedChar, int keyCode) { }

    public void solvePos(){
        this.x = father.x;
        this.y = father.y;
    }
}
