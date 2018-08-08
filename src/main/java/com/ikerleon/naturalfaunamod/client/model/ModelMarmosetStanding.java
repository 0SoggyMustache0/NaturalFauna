package com.ikerleon.naturalfaunamod.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Affe - M�rbis
 * Created using Tabula 7.0.0
 */
public class ModelMarmosetStanding extends ModelBase {
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Body3;
    public ModelRenderer Bud;
    public ModelRenderer Foot11;
    public ModelRenderer Foot21;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;
    public ModelRenderer Tail3;
    public ModelRenderer Foot12;
    public ModelRenderer Foot13;
    public ModelRenderer Foot22;
    public ModelRenderer Foot23;
    public ModelRenderer Neck;
    public ModelRenderer Foot31;
    public ModelRenderer Foot41;
    public ModelRenderer Head;
    public ModelRenderer Ear1;
    public ModelRenderer Ear2;
    public ModelRenderer Nose1;
    public ModelRenderer Nose2;
    public ModelRenderer Nose3;
    public ModelRenderer Foot32;
    public ModelRenderer Foot33;
    public ModelRenderer Foot42;
    public ModelRenderer Foot43;

    public ModelMarmosetStanding() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Foot43 = new ModelRenderer(this, 53, 17);
        this.Foot43.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot43.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot43, -0.7285004297824331F, 0.0F, 0.0F);
        this.Foot22 = new ModelRenderer(this, 47, 12);
        this.Foot22.setRotationPoint(-0.9F, 2.5F, 1.2F);
        this.Foot22.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot22, -0.6373942428283291F, 0.0F, 0.0F);
        this.Tail2 = new ModelRenderer(this, 40, 6);
        this.Tail2.setRotationPoint(0.7F, -0.2F, 3.7F);
        this.Tail2.addBox(-0.7F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail2, 0.36425021489121656F, -0.9105382707654417F, -0.6373942428283291F);
        this.Body1 = new ModelRenderer(this, 19, 9);
        this.Body1.setRotationPoint(-0.2F, 17.6F, -1.1F);
        this.Body1.addBox(-1.9F, -2.4F, 0.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Body1, -0.7285004297824331F, 0.0F, 0.0F);
        this.Body3 = new ModelRenderer(this, 20, 0);
        this.Body3.setRotationPoint(0.6F, 0.0F, -3.0F);
        this.Body3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 3, 0.0F);
        this.Tail3 = new ModelRenderer(this, 40, 6);
        this.Tail3.setRotationPoint(-0.1F, 0.2F, 3.8F);
        this.Tail3.addBox(-0.6F, -0.7F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail3, 0.31869712141416456F, -0.40980330836826856F, 0.0F);
        this.Nose3 = new ModelRenderer(this, 9, 12);
        this.Nose3.setRotationPoint(0.1F, 0.0F, 1.1F);
        this.Nose3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Nose3, 0.0F, -1.1383037381507017F, 0.0F);
        this.Foot13 = new ModelRenderer(this, 53, 3);
        this.Foot13.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot13.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot13, -0.40980330836826856F, 0.0F, 0.0F);
        this.Ear2 = new ModelRenderer(this, 0, 15);
        this.Ear2.setRotationPoint(-0.6F, -0.8F, -3.5F);
        this.Ear2.addBox(-3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F);
        this.setRotateAngle(Ear2, -0.18203784098300857F, 0.6829473363053812F, 0.0F);
        this.Foot23 = new ModelRenderer(this, 53, 7);
        this.Foot23.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot23.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot23, -0.40980330836826856F, 0.0F, 0.0F);
        this.Foot21 = new ModelRenderer(this, 39, 12);
        this.Foot21.setRotationPoint(-1.9F, -0.1F, 0.3F);
        this.Foot21.addBox(-1.2F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Foot21, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot31 = new ModelRenderer(this, 45, 19);
        this.Foot31.setRotationPoint(-1.9F, 0.0F, 0.1F);
        this.Foot31.addBox(-1.1F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot31, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot11 = new ModelRenderer(this, 39, 12);
        this.Foot11.setRotationPoint(3.2F, -0.1F, 0.3F);
        this.Foot11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(Foot11, 0.27314402793711257F, 0.0F, 0.0F);
        this.Tail1 = new ModelRenderer(this, 40, 6);
        this.Tail1.setRotationPoint(-0.3F, 0.0F, 0.5F);
        this.Tail1.addBox(0.0F, -0.7F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(Tail1, 0.31869712141416456F, -0.9560913642424937F, 0.0F);
        this.Foot41 = new ModelRenderer(this, 45, 19);
        this.Foot41.setRotationPoint(2.0F, 0.1F, 0.0F);
        this.Foot41.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Foot41, 0.27314402793711257F, 0.0F, 0.0F);
        this.Foot33 = new ModelRenderer(this, 53, 13);
        this.Foot33.setRotationPoint(0.0F, 2.1F, -0.2F);
        this.Foot33.addBox(-1.3F, 0.0F, 0.0F, 3, 3, 0, 0.0F);
        this.setRotateAngle(Foot33, -0.7285004297824331F, 0.0F, 0.0F);
        this.Nose1 = new ModelRenderer(this, 0, 10);
        this.Nose1.setRotationPoint(-1.0F, 2.2F, -3.5F);
        this.Nose1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.Ear1 = new ModelRenderer(this, 0, 15);
        this.Ear1.setRotationPoint(-0.4F, -0.8F, -3.5F);
        this.Ear1.addBox(0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F);
        this.setRotateAngle(Ear1, -0.18203784098300857F, -0.6829473363053812F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.4F, 0.1F, -1.3F);
        this.Head.addBox(-3.0F, -1.4F, -4.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(Head, -0.27314402793711257F, 0.0F, 0.0F);
        this.Foot42 = new ModelRenderer(this, 47, 12);
        this.Foot42.setRotationPoint(0.1F, 2.5F, 1.2F);
        this.Foot42.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.Foot32 = new ModelRenderer(this, 47, 12);
        this.Foot32.setRotationPoint(-0.8F, 2.5F, 1.2F);
        this.Foot32.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot32, -0.36425021489121656F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 19);
        this.Neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck.addBox(-2.0F, -1.2F, -2.4F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.5462880558742251F, 0.0F, 0.0F);
        this.Nose2 = new ModelRenderer(this, 9, 12);
        this.Nose2.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.Nose2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Nose2, 0.0F, 1.1383037381507017F, 0.0F);
        this.Body2 = new ModelRenderer(this, 18, 20);
        this.Body2.setRotationPoint(0.1F, 0.2F, 3.6F);
        this.Body2.addBox(-2.5F, -3.1F, 0.0F, 6, 6, 3, 0.0F);
        this.Bud = new ModelRenderer(this, 38, 1);
        this.Bud.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.Bud.addBox(-1.2F, -1.4F, 0.0F, 3, 3, 1, 0.0F);
        this.Foot12 = new ModelRenderer(this, 47, 12);
        this.Foot12.setRotationPoint(0.1F, 2.5F, 1.2F);
        this.Foot12.addBox(-0.2F, 0.5F, -0.8F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Foot12, -0.6373942428283291F, 0.0F, 0.0F);
        this.Foot42.addChild(this.Foot43);
        this.Foot21.addChild(this.Foot22);
        this.Tail1.addChild(this.Tail2);
        this.Body1.addChild(this.Body3);
        this.Tail2.addChild(this.Tail3);
        this.Nose1.addChild(this.Nose3);
        this.Foot12.addChild(this.Foot13);
        this.Head.addChild(this.Ear2);
        this.Foot22.addChild(this.Foot23);
        this.Body2.addChild(this.Foot21);
        this.Body3.addChild(this.Foot31);
        this.Body2.addChild(this.Foot11);
        this.Bud.addChild(this.Tail1);
        this.Body3.addChild(this.Foot41);
        this.Foot32.addChild(this.Foot33);
        this.Head.addChild(this.Nose1);
        this.Head.addChild(this.Ear1);
        this.Neck.addChild(this.Head);
        this.Foot41.addChild(this.Foot42);
        this.Foot31.addChild(this.Foot32);
        this.Body3.addChild(this.Neck);
        this.Nose1.addChild(this.Nose2);
        this.Body1.addChild(this.Body2);
        this.Body2.addChild(this.Bud);
        this.Foot11.addChild(this.Foot12);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	if(this.isChild) {
    		float scaleFactor= 0.3F;
    	    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
    	    this.Body1.render(f5);
    	    GlStateManager.popMatrix();
    	}
    	else {
            float scaleFactor= 0.5F;
    	
    	    GlStateManager.pushMatrix();
    	    GlStateManager.translate(0F, 1.5F-1.5F*scaleFactor, 0F); 
    	    GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.Body1.render(f5);
            GlStateManager.popMatrix();
    	}
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
