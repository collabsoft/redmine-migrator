package gui.taiga

import java.awt.event.ActionEvent
import java.awt.event.ActionListener

import gui.controller.*
import org.viewaframework.controller.*

class TaigaProjectDeletionWarningController extends AbstractOpenerController<ActionListener,ActionEvent> {

    TaigaProjectDeletionWarningController() {
       super(new DeleteTaigaProjectWarningView())
    }

    Class<ActionListener> getSupportedClass() {
        return ActionListener
    }

}
