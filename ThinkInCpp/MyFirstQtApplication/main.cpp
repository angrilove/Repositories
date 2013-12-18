#include <QtGui/QApplication>
#include <QtGui/QLabel>
#include <QtGui/QPushButton>
#include "qmlapplicationviewer.h"

#include <QtGui/QSpinBox>
#include <QtGui/QSlider>
#include <QtGui/QHBoxLayout>

#include "finddialog.h"

Q_DECL_EXPORT int main(int argc, char *argv[])
{
//    QScopedPointer<QApplication> app(createApplication(argc, argv));

//    QmlApplicationViewer viewer;
//    viewer.setOrientation(QmlApplicationViewer::ScreenOrientationAuto);
//    viewer.setMainQmlFile(QLatin1String("qml/MyFirstQtApplication/main.qml"));
//    viewer.showExpanded();

//    return app->exec();
    QApplication app(argc, argv);
//    QLabel *label = new QLabel("<h1><i>Hello</i> <span style='color: red;'>Qt</span>!</h1>");
//    label->show();
//    QPushButton *button = new QPushButton("Quit");
//    QObject::connect(button, SIGNAL(clicked()), &app, SLOT(quit()));
//    button->show();
//    QWidget *window = new QWidget;
//    window->setWindowTitle("Enter YOur Age");

//    QSpinBox *spinBox = new QSpinBox;
//    QSlider *slider = new QSlider(Qt::Horizontal);
//    spinBox->setRange(0, 130);
//    slider->setRange(0, 130);

//    QObject::connect(spinBox, SIGNAL(valueChanged(int)), slider, SLOT(setValue(int)));
//    QObject::connect(slider, SIGNAL(valueChanged(int)), spinBox, SLOT(setValue(int)));
//    spinBox->setValue(30);

//    QHBoxLayout *layout = new QHBoxLayout;
//    layout->addWidget(spinBox);
//    layout->addWidget(slider);
//    window->setLayout(layout);

//    window->show();
    FindDialog *findDialog = new FindDialog;
    findDialog->show();;

    return app.exec();
}
