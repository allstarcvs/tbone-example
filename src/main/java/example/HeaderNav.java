package example;

import static com.allstarcvs.tbone.elements.SemanticUi.*;

import com.allstarcvs.tbone.View;
import com.allstarcvs.tbone.elements.UiNode;

public class HeaderNav extends View {

	@Override
	public UiNode<?> onRender() {

		return UiNode.element("nav")
				.attr("class", "ui fixed menu inverted navbar page grid").add(
						item("link").text("Home").click(e -> Client.gotoHome())
				);
	}
}
