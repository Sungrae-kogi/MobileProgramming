import 'package:flutter/material.dart';
//pubspec에 정의한 폰트 패키지를 import
import 'package:google_fonts/google_fonts.dart';

//여러 파일에서 공통적으로 쓰일 테마들을 정의

TextTheme textTheme(){
  return TextTheme(
    headline1: GoogleFonts.openSans(fontSize: 18.0, color: Colors.black),
    headline2: GoogleFonts.openSans(fontSize: 16.0, color: Colors.black, fontWeight: FontWeight.bold),
    bodyText1: GoogleFonts.openSans(fontSize: 14.0, color: Colors.grey),
    bodyText2: GoogleFonts.openSans(fontSize: 15.0, color: Colors.black),
  );
}

AppBarTheme appTheme(){
  return AppBarTheme(
    centerTitle: false,
    color: Colors.white,
    elevation: 0.0,
    textTheme: TextTheme(
      headline6: GoogleFonts.nanumGothic(
        fontSize: 16,
        fontWeight: FontWeight.bold,
        color: Colors.black,
      ),
    ),
  );
}

ThemeData theme(){
  return ThemeData(
    scaffoldBackgroundColor: Colors.white,
    textTheme: textTheme(),
    appBarTheme: appTheme(),
    primaryColor: Colors.orange,
  );
}
