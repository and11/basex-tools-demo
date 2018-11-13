module namespace _ = '_';

import module namespace i18n = "http:myfuncs/i18n";


declare function _:extract-language-packs($lang as xs:string) as element() {
    <language-pack i18n:lang="{ $lang }">
    {
        i18n:find-localized-messages($lang)
    }
    </language-pack>
};

