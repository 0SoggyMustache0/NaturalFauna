package com.ikerleon.naturalfaunamod.client.render;

import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.util.ZAWARenderUtils;

import com.ikerleon.naturalfaunamod.NFReference;
import com.ikerleon.naturalfaunamod.client.model.ModelCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.client.model.ModelCantabricCapercaillieCelo;
import com.ikerleon.naturalfaunamod.client.model.ModelPuffin;
import com.ikerleon.naturalfaunamod.entity.EntityCantabricCapercaillie;
import com.ikerleon.naturalfaunamod.entity.EntityPuffin;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import net.minecraft.client.renderer.entity.layers.LayerLlamaDecor;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCantabricCapercaillie extends RenderLivingZAWA<EntityCantabricCapercaillie> {
	
	public static final ResourceLocation texture = new ResourceLocation(NFReference.MOD_ID, "textures/entity/capercaillie/texture.png");


	public RenderCantabricCapercaillie(RenderManager rm) {
		super(rm, new ModelCantabricCapercaillie(), 0.4F);
		this.addLayer(new LayerCantabricCapercaillie(this));
	}
	
	protected ResourceLocation getEntityTexture(EntityCantabricCapercaillie entity)
    {
    	if(entity.isChild()) {
    		return ZAWARenderUtils.none;
    	}
    	else {
    		return getTextureOfVar(entity.getAnimalType());
    	}
    }

	@Override
	public ResourceLocation getTextureOfVar(int varient) {
		switch (varient) {
			case 0:
			default:
				return texture;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerCantabricCapercaillie implements LayerRenderer<EntityCantabricCapercaillie> {
	    private final RenderCantabricCapercaillie render;
	    private final ModelCantabricCapercaillieCelo modelCelo = new ModelCantabricCapercaillieCelo();
	    private final ModelCantabricCapercaillie modelF = new ModelCantabricCapercaillie();
		 
	    public LayerCantabricCapercaillie(RenderCantabricCapercaillie re)
	    {
	        this.render = re;
	    }
	 
	    public void doRenderLayer(EntityCantabricCapercaillie kat, float f, float f1, float f2, float f3, float f4, float f5, float f6)
	    {	    	
	        if (!kat.isInvisible())
	        {
	        	if (kat.getStatus() == EntityCantabricCapercaillie.CantabricCapercaillieState.CELO){
	        		this.render.bindTexture(this.render.getTextureOfVar(kat.getAnimalType()));
		            this.modelCelo.setModelAttributes(this.render.getMainModel());
		            this.modelCelo.setRotationAngles(f,f1,f3,f4,f5,f6, kat);
		            this.modelCelo.render(kat, f, f1, f2, f3, f4, f6);
	            }
	        }
	    } 
	    
	    @Override
		public boolean shouldCombineTextures() {
			return true;
		}  
	}    
	
	public static class RenderFactory implements IRenderFactory<EntityCantabricCapercaillie>{
		@Override
		public Render<? super EntityCantabricCapercaillie> createRenderFor(RenderManager manager) {
			return new RenderCantabricCapercaillie(manager);
		    }
	    }
}