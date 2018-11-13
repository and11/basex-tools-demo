module namespace  _ = "http:myfuncs/i18n" ;

declare namespace i18n = "http://my-schemas/i18n/v1";

declare function _:find-localized-messages($lang as xs:string) as element(i18n:text)* {

    for $element in collection()//i18n:text[@i18n:lang]
        let $tlang := data($element/@i18n:lang)
        where $tlang = $lang
        return $element
};
