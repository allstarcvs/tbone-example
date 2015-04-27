package example.views;

import static com.allstarcvs.tbone.elements.SemanticUi.*;

import com.allstarcvs.tbone.View;
import com.allstarcvs.tbone.elements.UiNode;

public class HelloWorld extends View {

	@Override
	protected UiNode<?> onRender() {
		return h1("Hello World!");
	}

}
