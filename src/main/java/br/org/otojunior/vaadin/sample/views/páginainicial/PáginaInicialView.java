package br.org.otojunior.vaadin.sample.views.páginainicial;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;import br.org.otojunior.vaadin.sample.views.main.MainView;


@Route(value = "inicio", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Página Inicial")
@CssImport("./styles/views/páginainicial/página-inicial-view.css")
public class PáginaInicialView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public PáginaInicialView() {
        setId("página-inicial-view");
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener( e-> {
            Notification.show("Hello " + name.getValue());
        });
    }

}
