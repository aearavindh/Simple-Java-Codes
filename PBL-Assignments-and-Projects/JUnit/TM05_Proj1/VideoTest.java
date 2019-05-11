package TM05_Proj1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoTest {

	Video video = new Video("Matrix");
	@Test
	public void testgetName() {
		assertEquals("Matrix",video.getName());
	}
	@Test
	public void testgetRating() {
		video.rating = 9;
		assertEquals(9,video.getRating());
	}
	@Test
	public void testgetCheckout() {
		video.checkout = true;
		assertTrue(video.getCheckout());
	}

}
