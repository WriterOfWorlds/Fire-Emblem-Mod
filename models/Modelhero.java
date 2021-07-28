// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhero extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelhero() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -52.0F, -5.0F, 10.0F, 52.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -5.0F, -6.0F, 12.0F, 5.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -53.0F, -6.0F, 12.0F, 5.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bb_main.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bb_main.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}