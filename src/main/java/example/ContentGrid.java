package example;

import static com.allstarcvs.tbone.elements.SemanticUi.*;

import com.allstarcvs.tbone.View;
import com.allstarcvs.tbone.elements.UiNode;

public class ContentGrid extends View {

	@Override
	public UiNode<?> onRender() {
		return grid("page").attr("id", "mainContent");// add ID for mockups
	}
}
