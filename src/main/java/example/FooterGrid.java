package example;

import static com.allstarcvs.tbone.elements.SemanticUi.*;

import com.allstarcvs.tbone.View;
import com.allstarcvs.tbone.elements.UiNode;

public class FooterGrid extends View {

	@Override
	public UiNode<?> onRender() {

		return grid("page").add(
				divider("hidden"),
				row()
						.add(column()
								.add(divider())
								.add(span("© AllStarCVs Technologies Limited 2015"))
						));
	}
}
