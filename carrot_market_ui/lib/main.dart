import 'package:carrot_market_ui/screens/main_screens.dart';
import 'package:carrot_market_ui/theme.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(CarrotMarketUI());
}

class CarrotMarketUI extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'carrot_market_ui',
      debugShowCheckedModeBanner: false,
      //home 속성은 시작될때 처음 표시되는 화면을 flutter에게 알림
      home: MainScreens(),
      theme: theme(),
    );
  }
}
