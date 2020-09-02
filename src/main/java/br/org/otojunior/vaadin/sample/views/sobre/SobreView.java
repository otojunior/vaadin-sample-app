package br.org.otojunior.vaadin.sample.views.sobre;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import br.org.otojunior.vaadin.sample.views.main.MainView;

@Route(value = "sobre", layout = MainView.class)
@PageTitle("Sobre")
@CssImport("./styles/views/sobre/sobre-view.css")
public class SobreView extends Div {

    public SobreView() {
        setId("sobre-view");
        add(new Label("Content placeholder"));
    }

}
