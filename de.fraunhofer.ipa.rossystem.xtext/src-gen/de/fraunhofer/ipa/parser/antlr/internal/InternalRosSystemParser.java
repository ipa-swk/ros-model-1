package de.fraunhofer.ipa.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'RosComponent'", "'TopicConnections'", "','", "'}'", "'ServiceConnections'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'GraphName'", "'MessageDefinition'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'ServiceServer'", "'ServiceName'", "'SrvRef'", "'ServiceClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }



     	private RosSystemGrammarAccess grammarAccess;

        public InternalRosSystemParser(TokenStream input, RosSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RosSystem";
       	}

       	@Override
       	protected RosSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystem.g:64:1: entryRuleRosSystem returns [EObject current=null] : iv_ruleRosSystem= ruleRosSystem EOF ;
    public final EObject entryRuleRosSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystem = null;


        try {
            // InternalRosSystem.g:64:50: (iv_ruleRosSystem= ruleRosSystem EOF )
            // InternalRosSystem.g:65:2: iv_ruleRosSystem= ruleRosSystem EOF
            {
             newCompositeNode(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSystem=ruleRosSystem();

            state._fsp--;

             current =iv_ruleRosSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystem.g:71:1: ruleRosSystem returns [EObject current=null] : ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' ( ( ruleEString ) ) )? (otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}' )? (otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleRosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_TopicConnections_9_0 = null;

        EObject lv_TopicConnections_11_0 = null;

        EObject lv_ServiceConnections_15_0 = null;

        EObject lv_ServiceConnections_17_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:77:2: ( ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' ( ( ruleEString ) ) )? (otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}' )? (otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' ( ( ruleEString ) ) )? (otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}' )? (otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' ( ( ruleEString ) ) )? (otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}' )? (otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalRosSystem.g:79:3: () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' ( ( ruleEString ) ) )? (otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}' )? (otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // InternalRosSystem.g:79:3: ()
            // InternalRosSystem.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSystemAccess().getRosSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getRosSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:94:3: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosSystem.g:95:4: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getNameKeyword_3_0());
                    			
                    // InternalRosSystem.g:99:4: ( (lv_Name_4_0= ruleEString ) )
                    // InternalRosSystem.g:100:5: (lv_Name_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:100:5: (lv_Name_4_0= ruleEString )
                    // InternalRosSystem.g:101:6: lv_Name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSystemRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_4_0,
                    							"de.fraunhofer.ipa.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:119:3: (otherlv_5= 'RosComponent' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystem.g:120:4: otherlv_5= 'RosComponent' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0());
                    			
                    // InternalRosSystem.g:124:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:125:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:125:5: ( ruleEString )
                    // InternalRosSystem.g:126:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:141:3: (otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:142:4: otherlv_7= 'TopicConnections' otherlv_8= '{' ( (lv_TopicConnections_9_0= ruleTopicConnection ) ) (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRosSystem.g:150:4: ( (lv_TopicConnections_9_0= ruleTopicConnection ) )
                    // InternalRosSystem.g:151:5: (lv_TopicConnections_9_0= ruleTopicConnection )
                    {
                    // InternalRosSystem.g:151:5: (lv_TopicConnections_9_0= ruleTopicConnection )
                    // InternalRosSystem.g:152:6: lv_TopicConnections_9_0= ruleTopicConnection
                    {

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_TopicConnections_9_0=ruleTopicConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSystemRule());
                    						}
                    						add(
                    							current,
                    							"TopicConnections",
                    							lv_TopicConnections_9_0,
                    							"de.fraunhofer.ipa.RosSystem.TopicConnection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:169:4: (otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRosSystem.g:170:5: otherlv_10= ',' ( (lv_TopicConnections_11_0= ruleTopicConnection ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosSystem.g:174:5: ( (lv_TopicConnections_11_0= ruleTopicConnection ) )
                    	    // InternalRosSystem.g:175:6: (lv_TopicConnections_11_0= ruleTopicConnection )
                    	    {
                    	    // InternalRosSystem.g:175:6: (lv_TopicConnections_11_0= ruleTopicConnection )
                    	    // InternalRosSystem.g:176:7: lv_TopicConnections_11_0= ruleTopicConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_TopicConnections_11_0=ruleTopicConnection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"TopicConnections",
                    	    								lv_TopicConnections_11_0,
                    	    								"de.fraunhofer.ipa.RosSystem.TopicConnection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:199:3: (otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRosSystem.g:200:4: otherlv_13= 'ServiceConnections' otherlv_14= '{' ( (lv_ServiceConnections_15_0= ruleServiceConnection ) ) (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosSystem.g:208:4: ( (lv_ServiceConnections_15_0= ruleServiceConnection ) )
                    // InternalRosSystem.g:209:5: (lv_ServiceConnections_15_0= ruleServiceConnection )
                    {
                    // InternalRosSystem.g:209:5: (lv_ServiceConnections_15_0= ruleServiceConnection )
                    // InternalRosSystem.g:210:6: lv_ServiceConnections_15_0= ruleServiceConnection
                    {

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_ServiceConnections_15_0=ruleServiceConnection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSystemRule());
                    						}
                    						add(
                    							current,
                    							"ServiceConnections",
                    							lv_ServiceConnections_15_0,
                    							"de.fraunhofer.ipa.RosSystem.ServiceConnection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:227:4: (otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRosSystem.g:228:5: otherlv_16= ',' ( (lv_ServiceConnections_17_0= ruleServiceConnection ) )
                    	    {
                    	    otherlv_16=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRosSystem.g:232:5: ( (lv_ServiceConnections_17_0= ruleServiceConnection ) )
                    	    // InternalRosSystem.g:233:6: (lv_ServiceConnections_17_0= ruleServiceConnection )
                    	    {
                    	    // InternalRosSystem.g:233:6: (lv_ServiceConnections_17_0= ruleServiceConnection )
                    	    // InternalRosSystem.g:234:7: lv_ServiceConnections_17_0= ruleServiceConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_ServiceConnections_17_0=ruleServiceConnection();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ServiceConnections",
                    	    								lv_ServiceConnections_17_0,
                    	    								"de.fraunhofer.ipa.RosSystem.ServiceConnection");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystem.g:265:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosSystem.g:265:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosSystem.g:266:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalRosSystem.g:272:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:278:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosSystem.g:279:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosSystem.g:279:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRosSystem.g:280:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:289:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:298:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleTopicConnection"
    // InternalRosSystem.g:310:1: entryRuleTopicConnection returns [EObject current=null] : iv_ruleTopicConnection= ruleTopicConnection EOF ;
    public final EObject entryRuleTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicConnection = null;


        try {
            // InternalRosSystem.g:310:56: (iv_ruleTopicConnection= ruleTopicConnection EOF )
            // InternalRosSystem.g:311:2: iv_ruleTopicConnection= ruleTopicConnection EOF
            {
             newCompositeNode(grammarAccess.getTopicConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicConnection=ruleTopicConnection();

            state._fsp--;

             current =iv_ruleTopicConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopicConnection"


    // $ANTLR start "ruleTopicConnection"
    // InternalRosSystem.g:317:1: ruleTopicConnection returns [EObject current=null] : ( () otherlv_1= 'TopicConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTopicConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRosSystem.g:323:2: ( ( () otherlv_1= 'TopicConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRosSystem.g:324:2: ( () otherlv_1= 'TopicConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRosSystem.g:324:2: ( () otherlv_1= 'TopicConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRosSystem.g:325:3: () otherlv_1= 'TopicConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRosSystem.g:325:3: ()
            // InternalRosSystem.g:326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicConnectionAccess().getTopicConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:340:3: (otherlv_3= 'From' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystem.g:341:4: otherlv_3= 'From' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getTopicConnectionAccess().getFromKeyword_3_0());
                    			
                    // InternalRosSystem.g:345:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:346:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:346:5: ( ruleEString )
                    // InternalRosSystem.g:347:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicConnectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromPublisherCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:362:3: (otherlv_5= 'To' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:363:4: otherlv_5= 'To' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getTopicConnectionAccess().getToKeyword_4_0());
                    			
                    // InternalRosSystem.g:367:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:368:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:368:5: ( ruleEString )
                    // InternalRosSystem.g:369:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicConnectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTopicConnectionAccess().getToSubscriberCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopicConnection"


    // $ANTLR start "entryRuleServiceConnection"
    // InternalRosSystem.g:392:1: entryRuleServiceConnection returns [EObject current=null] : iv_ruleServiceConnection= ruleServiceConnection EOF ;
    public final EObject entryRuleServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConnection = null;


        try {
            // InternalRosSystem.g:392:58: (iv_ruleServiceConnection= ruleServiceConnection EOF )
            // InternalRosSystem.g:393:2: iv_ruleServiceConnection= ruleServiceConnection EOF
            {
             newCompositeNode(grammarAccess.getServiceConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConnection=ruleServiceConnection();

            state._fsp--;

             current =iv_ruleServiceConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceConnection"


    // $ANTLR start "ruleServiceConnection"
    // InternalRosSystem.g:399:1: ruleServiceConnection returns [EObject current=null] : ( () otherlv_1= 'ServiceConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleServiceConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRosSystem.g:405:2: ( ( () otherlv_1= 'ServiceConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalRosSystem.g:406:2: ( () otherlv_1= 'ServiceConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalRosSystem.g:406:2: ( () otherlv_1= 'ServiceConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalRosSystem.g:407:3: () otherlv_1= 'ServiceConnection' otherlv_2= '{' (otherlv_3= 'From' ( ( ruleEString ) ) )? (otherlv_5= 'To' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalRosSystem.g:407:3: ()
            // InternalRosSystem.g:408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceConnectionAccess().getServiceConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:422:3: (otherlv_3= 'From' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosSystem.g:423:4: otherlv_3= 'From' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceConnectionAccess().getFromKeyword_3_0());
                    			
                    // InternalRosSystem.g:427:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:428:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:428:5: ( ruleEString )
                    // InternalRosSystem.g:429:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceConnectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromServiceServerCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:444:3: (otherlv_5= 'To' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosSystem.g:445:4: otherlv_5= 'To' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceConnectionAccess().getToKeyword_4_0());
                    			
                    // InternalRosSystem.g:449:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:450:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:450:5: ( ruleEString )
                    // InternalRosSystem.g:451:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceConnectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceConnectionAccess().getToServiceClientCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:474:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystem.g:474:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystem.g:475:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosSystem.g:481:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:487:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystem.g:488:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystem.g:488:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystem.g:489:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:497:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePublisher"
    // InternalRosSystem.g:508:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRosSystem.g:508:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRosSystem.g:509:2: iv_rulePublisher= rulePublisher EOF
            {
             newCompositeNode(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublisher=rulePublisher();

            state._fsp--;

             current =iv_rulePublisher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalRosSystem.g:515:1: rulePublisher returns [EObject current=null] : ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_TopicName_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:521:2: ( ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalRosSystem.g:522:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:522:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalRosSystem.g:523:3: () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalRosSystem.g:523:3: ()
            // InternalRosSystem.g:524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getPublisherKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:538:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosSystem.g:539:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalRosSystem.g:543:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalRosSystem.g:544:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:544:5: (lv_TopicName_4_0= ruleEString )
                    // InternalRosSystem.g:545:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:563:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystem.g:564:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalRosSystem.g:568:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:569:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:569:5: ( ruleEString )
                    // InternalRosSystem.g:570:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:585:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:586:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalRosSystem.g:590:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:591:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:591:5: ( ruleEString )
                    // InternalRosSystem.g:592:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalRosSystem.g:615:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRosSystem.g:615:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRosSystem.g:616:2: iv_ruleSubscriber= ruleSubscriber EOF
            {
             newCompositeNode(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscriber=ruleSubscriber();

            state._fsp--;

             current =iv_ruleSubscriber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalRosSystem.g:622:1: ruleSubscriber returns [EObject current=null] : ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_TopicName_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:628:2: ( ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalRosSystem.g:629:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:629:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalRosSystem.g:630:3: () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalRosSystem.g:630:3: ()
            // InternalRosSystem.g:631:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getSubscriberKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:645:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystem.g:646:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalRosSystem.g:650:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalRosSystem.g:651:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:651:5: (lv_TopicName_4_0= ruleEString )
                    // InternalRosSystem.g:652:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:670:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystem.g:671:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalRosSystem.g:675:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:676:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:676:5: ( ruleEString )
                    // InternalRosSystem.g:677:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:692:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosSystem.g:693:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalRosSystem.g:697:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:698:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:698:5: ( ruleEString )
                    // InternalRosSystem.g:699:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystem.g:722:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosSystem.g:722:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosSystem.g:723:2: iv_ruleGraphName= ruleGraphName EOF
            {
             newCompositeNode(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;

             current =iv_ruleGraphName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalRosSystem.g:729:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystem.g:735:2: (kw= 'GraphName' )
            // InternalRosSystem.g:736:2: kw= 'GraphName'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalRosSystem.g:744:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRosSystem.g:744:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRosSystem.g:745:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
            {
             newCompositeNode(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageDefinition=ruleMessageDefinition();

            state._fsp--;

             current =iv_ruleMessageDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalRosSystem.g:751:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= 'MessageDefinition' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:757:2: ( ( () otherlv_1= 'MessageDefinition' ) )
            // InternalRosSystem.g:758:2: ( () otherlv_1= 'MessageDefinition' )
            {
            // InternalRosSystem.g:758:2: ( () otherlv_1= 'MessageDefinition' )
            // InternalRosSystem.g:759:3: () otherlv_1= 'MessageDefinition'
            {
            // InternalRosSystem.g:759:3: ()
            // InternalRosSystem.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystem.g:774:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosSystem.g:774:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosSystem.g:775:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalRosSystem.g:781:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:787:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:788:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:788:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:789:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:789:3: ()
            // InternalRosSystem.g:790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:804:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystem.g:805:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:813:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:814:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:814:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:815:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:832:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRosSystem.g:833:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:837:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:838:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:838:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:839:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalRosSystem.g:870:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosSystem.g:870:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosSystem.g:871:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalRosSystem.g:877:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:883:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:884:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:884:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:885:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:885:3: ()
            // InternalRosSystem.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:900:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystem.g:901:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:909:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:910:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:910:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:911:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:928:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRosSystem.g:929:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:933:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:934:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:934:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:935:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalRosSystem.g:966:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosSystem.g:966:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosSystem.g:967:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalRosSystem.g:973:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:979:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:980:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:980:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:981:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:981:3: ()
            // InternalRosSystem.g:982:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:996:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystem.g:997:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:1005:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:1006:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:1006:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:1007:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1024:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRosSystem.g:1025:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:1029:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:1030:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:1030:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:1031:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleServiceServer"
    // InternalRosSystem.g:1062:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRosSystem.g:1062:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRosSystem.g:1063:2: iv_ruleServiceServer= ruleServiceServer EOF
            {
             newCompositeNode(grammarAccess.getServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceServer=ruleServiceServer();

            state._fsp--;

             current =iv_ruleServiceServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceServer"


    // $ANTLR start "ruleServiceServer"
    // InternalRosSystem.g:1069:1: ruleServiceServer returns [EObject current=null] : ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_ServiceName_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1075:2: ( ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalRosSystem.g:1076:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:1076:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalRosSystem.g:1077:3: () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalRosSystem.g:1077:3: ()
            // InternalRosSystem.g:1078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceServerAccess().getServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getServiceServerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:1092:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:1093:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalRosSystem.g:1097:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalRosSystem.g:1098:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:1098:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalRosSystem.g:1099:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:1117:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystem.g:1118:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalRosSystem.g:1122:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:1123:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:1123:5: ( ruleEString )
                    // InternalRosSystem.g:1124:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:1139:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystem.g:1140:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalRosSystem.g:1144:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:1145:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:1145:5: ( ruleEString )
                    // InternalRosSystem.g:1146:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceServer"


    // $ANTLR start "entryRuleServiceClient"
    // InternalRosSystem.g:1169:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRosSystem.g:1169:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRosSystem.g:1170:2: iv_ruleServiceClient= ruleServiceClient EOF
            {
             newCompositeNode(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceClient=ruleServiceClient();

            state._fsp--;

             current =iv_ruleServiceClient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // InternalRosSystem.g:1176:1: ruleServiceClient returns [EObject current=null] : ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_ServiceName_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1182:2: ( ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalRosSystem.g:1183:2: ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:1183:2: ( () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // InternalRosSystem.g:1184:3: () otherlv_1= 'ServiceClient' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalRosSystem.g:1184:3: ()
            // InternalRosSystem.g:1185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceClientAccess().getServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getServiceClientKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:1199:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystem.g:1200:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalRosSystem.g:1204:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalRosSystem.g:1205:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:1205:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalRosSystem.g:1206:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:1224:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:1225:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalRosSystem.g:1229:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:1230:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:1230:5: ( ruleEString )
                    // InternalRosSystem.g:1231:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceClientRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:1246:3: (otherlv_7= 'NameSpace' ( ( ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:1247:4: otherlv_7= 'NameSpace' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalRosSystem.g:1251:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:1252:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:1252:5: ( ruleEString )
                    // InternalRosSystem.g:1253:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceClientRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceClient"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000006E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000006C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001804020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001004020000L});

}