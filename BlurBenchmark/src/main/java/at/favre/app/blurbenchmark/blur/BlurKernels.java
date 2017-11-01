package at.favre.app.blurbenchmark.blur;

/**
 * Blur kernels for convolve matrix algorithms
 *
 * @author pfavre
 */
public interface BlurKernels {
	public static float[] GAUSSIAN_5x5 = new float[] {
		0.0030f,    0.0133f,    0.0219f,    0.0133f,    0.0030f,
		0.0133f,    0.0596f,    0.0983f,    0.0596f,    0.0133f,
		0.0219f,    0.0983f,    0.1621f,    0.0983f,    0.0219f,
		0.0133f,    0.0596f,    0.0983f,    0.0596f,    0.0133f,
		0.0030f,    0.0133f,    0.0219f,    0.0133f,    0.0030f
	};

	public static float[] BOX_5x5 = new float[] {
			0.04f,0.04f,0.04f,0.04f,0.04f,
			0.04f,0.04f,0.04f,0.04f,0.04f,
			0.04f,0.0425f,0.05f,0.0425f,0.04f,
			0.04f,0.04f,0.04f,0.04f,0.04f,
			0.04f,0.04f,0.04f,0.04f,0.04f
	};

	public static float[] BOX_3x3 = new float[]{
			0.111111111111111111111111112f, 0.111111111111111111111111112f, 0.111111111111111111111111112f,
			0.111111111111111111111111112f, 0.13f, 0.111111111111111111111111112f,
			0.111111111111111111111111112f, 0.111111111111111111111111112f, 0.111111111111111111111111112f
	};

}
