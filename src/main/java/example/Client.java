package example;

import static com.allstarcvs.tbone.elements.UiNode.*;

import com.allstarcvs.tbone.TBone;

import example.views.HelloWorld;

public class Client {

	private static final ContentGrid content = new ContentGrid();

	public static void main(final String... args) {

		TBone.startObserver();
		body().add(
				new HeaderNav(),
				content,
				new FooterGrid());

		setupRouter();
	}

	// ====================================================================================================
	// Router
	// ====================================================================================================

	private static void setupRouter() {

		TBone.page("/", (Runnable) () -> content.show(new HelloWorld()));
		TBone.page().redirect("*", "/");
		TBone.pageStart();
	}

	public static void gotoHome() {
		TBone.show("/");
	}
}
