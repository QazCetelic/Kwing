package kwing.events

import javax.swing.InputVerifier
import javax.swing.JComponent

/**
 * Creates an [InputVerifier] is run when the component with the verifier loses focus.
 */
fun InputVerifier(verifyAction: JComponent.() -> Boolean): InputVerifier {
    return object: InputVerifier() {
        override fun verify(input: JComponent): Boolean {
            return verifyAction(input)
        }
    }
}