package kwing

import javax.swing.*

typealias ComponentSetup<T> = T.() -> Unit

typealias Text = JLabel

// Container
typealias Window    = JFrame
typealias Panel     = JPanel

// Text Input
typealias TextArea  = JTextArea
typealias TextField = JTextField

// Button
typealias Button = JButton
typealias ToggleButton = JToggleButton
// Box
typealias CheckBox  = JCheckBox
typealias SelectBox = JRadioButton

// Data Display
typealias ProgressBar = JProgressBar
typealias Tree = JTree

typealias FileChooser = JFileChooser